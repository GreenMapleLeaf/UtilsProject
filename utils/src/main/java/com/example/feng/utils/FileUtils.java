package com.example.feng.utils;

import android.text.TextUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Feng on 2017/10/31.
 */

public class FileUtils {
    public static interface FileDeleteCallback {
        void callback(long size);
    }

    public static final long getFileSize(String filePath) {
        if (!TextUtils.isEmpty(filePath)) {
            return getFileSize(new File(filePath));
        }
        return 0;
    }

    public static final long getFileSize(File file) {
        int sumSize = 0;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int index = 0, size = (files == null || files.length == 0 ? 0 : files.length); index < size; index++) {
                    sumSize += getFileSize(files[index]);
                }
            } else {
                sumSize += file.length();
            }
        }
        return sumSize;
    }

    public static final void DeleteFile(String filePath) {
        if (!TextUtils.isEmpty(filePath)) {
            DeleteFile(new File(filePath), null);
        }
    }

    public static final void DeleteFile(File file, FileDeleteCallback callback) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int index = 0, size = (files == null || files.length == 0 ? 0 : files.length); index < size; index++) {
                    DeleteFile(files[index], callback);
                }
            } else {
                long fileLength = file.length();
                file.delete();
            }
        }
    }

    public static final File getFile(String fileDirPath) {
        if (!TextUtils.isEmpty(fileDirPath)) {
            File fileDir = new File(fileDirPath);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            return fileDir;
        } else {
            return null;
        }
    }


    public static final void deleteAllFile(String filePath) {
        deleteAllFile(new File(filePath));
    }

    public static final void deleteAllFile(File file) {
        if (file == null)
            return;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File innerFile : files) {
                    deleteAllFile(innerFile);
                }
            } else {
                file.delete();
            }
        }
    }

    public static synchronized final String saveFile(byte[] data, String fileDirPath, String fileName) {
        return saveFile(data, fileDirPath + File.separator + fileName);
    }

    public static synchronized final String saveFile(byte[] data, String filePath) {
        File file = createFile(filePath);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(data, 0, data.length);
            fos.flush();
            return file.getPath();
        } catch (FileNotFoundException e) {
            LogUtils.I(e.getMessage());
        } catch (IOException e) {
            LogUtils.I(e.getMessage());
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
            }
        }
        return null;
    }

    public static final byte[] readFileBytes(String filePath) {
        File file = createFile(filePath);
        byte[] datas = null;
        if (file != null && file.length() != 0) {
            datas = new byte[(int) ((file.length() + 8 - 1) / 8)];
            FileInputStream fr = null;
            try {
                fr = new FileInputStream(file);
                int len = 0;
                int cursorP = 0;
                byte[] temp = new byte[2048];
                while ((len = fr.read(temp)) != -1) {
                    int readLen = Math.min(len, datas.length - cursorP);
                    if (readLen > 0) {
                        System.arraycopy(temp, 0, datas, cursorP, readLen);
                        cursorP += readLen;
                    }
                }
            } catch (FileNotFoundException e) {
                LogUtils.I(e.getMessage());
            } catch (IOException e) {
                LogUtils.I(e.getMessage());
            } finally {
                if (fr != null) {
                    try {
                        fr.close();
                    } catch (IOException e) {
                        LogUtils.I(e.getMessage());
                    }
                }
            }

        }
        return datas;
    }

        //***************************************************

    public final static File createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }


    public final static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }
}
