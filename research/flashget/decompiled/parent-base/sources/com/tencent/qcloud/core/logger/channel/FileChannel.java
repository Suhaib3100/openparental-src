package com.tencent.qcloud.core.logger.channel;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.logger.LogEntity;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class FileChannel extends BaseLogChannel {
    private static final long BUFFER_SIZE = 32768;
    private static final long LOG_FLUSH_DURATION = 10000;
    private static final int MAX_FILE_COUNT = 30;
    private static final int MAX_FILE_SIZE = 3145728;
    private static final int MSG_FLUSH_ALL = 0;
    private static final int MSG_FLUSH_CONTENT = 1;
    private static FileChannel instance;
    private final Handler handler;
    private File latestLogFile;
    private final File logRootDir;
    private static final String ALGORITHM = ProtectedSandApp.s("媜\u0001");
    private static final String LOG_DIR = ProtectedSandApp.s("媝\u0001");
    private static final byte[] object = new byte[0];
    private final List<LogEntity> bufferRecord = Collections.synchronizedList(new ArrayList());
    private volatile long mBufferSize = 0;
    private byte[] encryptionKey = null;
    private byte[] ivParameter = null;

    private FileChannel(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir());
        this.logRootDir = new File(c.a(sb, File.separator, ProtectedSandApp.s("媝\u0001")));
        HandlerThread handlerThread = new HandlerThread(ProtectedSandApp.s("媞\u0001"), 1);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.tencent.qcloud.core.logger.channel.FileChannel.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i4 = message.what;
                if (i4 == 0) {
                    FileChannel.this.flush();
                    sendEmptyMessageDelayed(0, 10000L);
                } else {
                    if (i4 != 1) {
                        return;
                    }
                    FileChannel.this.input();
                }
            }
        };
        this.handler = handler;
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 0;
        handler.sendMessage(obtainMessage);
    }

    private void cleanFilesIfNecessary(File[] fileArr) {
        if (fileArr == null || fileArr.length < 30) {
            return;
        }
        fileArr[fileArr.length - 1].delete();
    }

    private byte[] encryptSingle(byte[] bArr, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) throws Exception {
        Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("媜\u0001"));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void flush() {
        if (this.mBufferSize <= 0) {
            return;
        }
        write(this.bufferRecord);
        this.bufferRecord.clear();
        this.mBufferSize = 0L;
    }

    private String formatDateString(long j4) {
        return new SimpleDateFormat(ProtectedSandApp.s("媟\u0001"), Locale.getDefault()).format(Long.valueOf(j4));
    }

    public static FileChannel getInstance(Context context) {
        synchronized (FileChannel.class) {
            try {
                if (instance == null) {
                    instance = new FileChannel(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    private File getLogFile(long j4) {
        File[] listFiles = this.logRootDir.listFiles();
        File file = this.latestLogFile;
        String s4 = ProtectedSandApp.s("媠\u0001");
        if (file == null) {
            if (!this.logRootDir.exists() && !this.logRootDir.mkdirs()) {
                return null;
            }
            if (listFiles != null && listFiles.length > 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.tencent.qcloud.core.logger.channel.FileChannel.3
                    @Override // java.util.Comparator
                    public int compare(File file2, File file3) {
                        return Long.valueOf(file3.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                    }
                });
                for (File file2 : listFiles) {
                    boolean contains = file2.getName().contains(s4);
                    byte[] bArr = this.encryptionKey;
                    if ((bArr != null && contains) || (bArr == null && !contains)) {
                        this.latestLogFile = file2;
                        break;
                    }
                }
            }
        }
        File file3 = this.latestLogFile;
        String s5 = ProtectedSandApp.s("媡\u0001");
        if (file3 != null && file3.length() < 3145728) {
            String name = this.latestLogFile.getName();
            if (isSameDay(name.replace(ProtectedSandApp.s("媢\u0001"), "").replace(s5, ""), j4)) {
                boolean contains2 = name.contains(s4);
                byte[] bArr2 = this.encryptionKey;
                if ((bArr2 != null && contains2) || (bArr2 == null && !contains2)) {
                    return this.latestLogFile;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(formatDateString(j4));
        if (this.encryptionKey == null) {
            s4 = "";
        }
        String a5 = c.a(sb, s4, s5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.logRootDir);
        this.latestLogFile = new File(c.a(sb2, File.separator, a5));
        cleanFilesIfNecessary(listFiles);
        return this.latestLogFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void input() {
        if (this.mBufferSize > 32768) {
            flush();
        }
    }

    private boolean isSameDay(String str, long j4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("媟\u0001"), Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ProtectedSandApp.s("媣\u0001"), Locale.getDefault());
        try {
            return simpleDateFormat2.format(simpleDateFormat.parse(str)).equals(simpleDateFormat2.format(Long.valueOf(j4)));
        } catch (ParseException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private void write(List<LogEntity> list) {
        synchronized (object) {
            if (list == null) {
                return;
            }
            DataOutputStream dataOutputStream = null;
            try {
                try {
                    File logFile = getLogFile(System.currentTimeMillis());
                    if (logFile != null) {
                        DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(logFile, true), 8192));
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            try {
                                try {
                                    byte[] bytes = list.get(i4).toString().getBytes(ProtectedSandApp.s("媤\u0001"));
                                    if (this.encryptionKey != null) {
                                        try {
                                            appendEncryptedLog(dataOutputStream2, bytes);
                                        } catch (Exception e4) {
                                            e4.printStackTrace();
                                        }
                                    } else {
                                        dataOutputStream2.write(bytes);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    dataOutputStream = dataOutputStream2;
                                    if (dataOutputStream != null) {
                                        try {
                                            dataOutputStream.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            } catch (FileNotFoundException e6) {
                                e = e6;
                                dataOutputStream = dataOutputStream2;
                                e.printStackTrace();
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (IOException e7) {
                                        e = e7;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (IOException e10) {
                                e = e10;
                                dataOutputStream = dataOutputStream2;
                                e.printStackTrace();
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (IOException e11) {
                                        e = e11;
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                        dataOutputStream2.flush();
                        dataOutputStream = dataOutputStream2;
                    }
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e13) {
                e = e13;
            } catch (IOException e14) {
                e = e14;
            }
        }
    }

    public void appendEncryptedLog(DataOutputStream dataOutputStream, byte[] bArr) throws Exception {
        byte[] encryptSingle = encryptSingle(bArr, new SecretKeySpec(this.encryptionKey, ProtectedSandApp.s("媥\u0001")), new IvParameterSpec(this.ivParameter));
        dataOutputStream.writeInt(encryptSingle.length);
        dataOutputStream.write(encryptSingle);
    }

    public File[] getLogFilesDesc(int i4) {
        if (this.logRootDir.listFiles() == null || this.logRootDir.listFiles().length <= 0) {
            return null;
        }
        File[] listFiles = this.logRootDir.listFiles();
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.tencent.qcloud.core.logger.channel.FileChannel.2
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
            }
        });
        int min = Math.min(i4, listFiles.length);
        File[] fileArr = new File[min];
        System.arraycopy(listFiles, 0, fileArr, 0, min);
        return fileArr;
    }

    public String getLogRootDir() {
        return this.logRootDir.getAbsolutePath();
    }

    public boolean isLoggable(LogEntity logEntity) {
        if (!isEnabled() || logEntity == null) {
            return false;
        }
        return logEntity.getLevel().isLoggable(getMinLevel());
    }

    @Override // com.tencent.qcloud.core.logger.channel.BaseLogChannel
    public synchronized void log(LogEntity logEntity) {
        if (isLoggable(logEntity)) {
            this.bufferRecord.add(logEntity);
            this.mBufferSize += logEntity.getLength();
            this.handler.removeMessages(1);
            this.handler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    public void setEncryptionKey(byte[] bArr, byte[] bArr2) {
        this.encryptionKey = bArr != null ? (byte[]) bArr.clone() : null;
        this.ivParameter = bArr2 != null ? (byte[]) bArr2.clone() : null;
    }
}
