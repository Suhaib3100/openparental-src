package com.tencent.qcloud.network.sonar.command;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import com.tencent.qcloud.network.sonar.utils.Utils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes7.dex */
public abstract class CommandTask<T> {
    protected static float COMMAND_ELAPSED_TIME;
    protected String command;
    protected Process process;
    protected T resultData;
    protected final String TAG = getClass().getSimpleName();
    protected boolean isRunning = false;
    protected InputStream dataInputStream = null;
    protected InputStream errorInputStream = null;

    protected Process createProcess(String str) throws IOException {
        return Runtime.getRuntime().exec(str);
    }

    protected String execCommand(String str) throws InterruptedException, IOException {
        String str2;
        SonarLog.d(this.TAG, ProtectedSandApp.s("嫦\u0001") + str);
        Process createProcess = createProcess(str);
        this.process = createProcess;
        int waitFor = createProcess.waitFor();
        SonarLog.d(this.TAG, ProtectedSandApp.s("嫧\u0001") + waitFor);
        this.dataInputStream = this.process.getInputStream();
        this.errorInputStream = this.process.getErrorStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.dataInputStream);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(this.errorInputStream);
        String str3 = "";
        try {
            try {
                str2 = readData(bufferedInputStream);
            } catch (IOException e4) {
                e = e4;
                str2 = "";
            }
            try {
                str3 = readData(bufferedInputStream2);
                Utils.closeAllCloseable(bufferedInputStream, this.dataInputStream, bufferedInputStream2, this.errorInputStream);
            } catch (IOException e5) {
                e = e5;
                if (SonarLog.openLog) {
                    e.printStackTrace();
                }
                Utils.closeAllCloseable(bufferedInputStream, this.dataInputStream, bufferedInputStream2, this.errorInputStream);
                this.process.destroy();
                parseErrorInfo(str3);
                return str2;
            }
            this.process.destroy();
            parseErrorInfo(str3);
            return str2;
        } catch (Throwable th) {
            Utils.closeAllCloseable(bufferedInputStream, this.dataInputStream, bufferedInputStream2, this.errorInputStream);
            this.process.destroy();
            parseErrorInfo("");
            throw th;
        }
    }

    public T getResultData() {
        return this.resultData;
    }

    protected abstract void parseErrorInfo(String str);

    protected abstract void parseInputInfo(String str);

    protected String readData(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        byte[] bArr2 = null;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            if (bArr2 == null) {
                bArr2 = Arrays.copyOf(bArr, read);
            } else {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length + read];
                System.arraycopy(bArr2, 0, bArr3, 0, length);
                System.arraycopy(bArr, 0, bArr3, length, read);
                bArr2 = bArr3;
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return new String(bArr2, Charset.forName(ProtectedSandApp.s("嫨\u0001")));
    }

    protected abstract T run();

    protected abstract void stop();
}
