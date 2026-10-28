package com.tencent.cos.xml.transfer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.CosXmlResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
final class TaskStateMonitor implements Runnable {
    public static final int MESSAGE_RELEASE_LOOP = 3;
    public static final int MESSAGE_TASK_CONSTRAINT = 5;
    public static final int MESSAGE_TASK_INIT = 4;
    public static final int MESSAGE_TASK_MANUAL = 2;
    public static final int MESSAGE_TASK_RESULT = 1;
    private static final String TAG = ProtectedSandApp.s("侺\u0001");
    private static TaskStateMonitor monitor;
    private static Handler taskHandler;
    private Looper looper;
    private volatile boolean isRunning = false;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    private class StructMsg {
        COSXMLTask cosxmlTask;
        Exception exception;
        CosXmlResult result;
        volatile TransferState transferState;

        private StructMsg() {
        }
    }

    private TaskStateMonitor() {
    }

    public static TaskStateMonitor getInstance() {
        synchronized (TaskStateMonitor.class) {
            try {
                if (monitor == null) {
                    monitor = new TaskStateMonitor();
                }
                monitor.monitor();
            } catch (Throwable th) {
                throw th;
            }
        }
        return monitor;
    }

    private void monitor() {
        if (this.isRunning) {
            return;
        }
        this.executorService.submit(this);
        this.isRunning = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseLooper() {
        quitSafely();
    }

    private void setMessageQueue() throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, InstantiationException {
        Field declaredField = Looper.class.getDeclaredField(ProtectedSandApp.s("侷\u0001"));
        declaredField.setAccessible(true);
        for (Constructor<?> constructor : Class.forName(ProtectedSandApp.s("侸\u0001")).getDeclaredConstructors()) {
            constructor.setAccessible(true);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length = parameterTypes.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (parameterTypes[i4].getName().equalsIgnoreCase(ProtectedSandApp.s("侹\u0001"))) {
                    declaredField.set(this.looper, constructor.newInstance(Boolean.TRUE));
                    break;
                }
                i4++;
            }
        }
    }

    public Looper getLooper() {
        if (!Thread.currentThread().isAlive()) {
            return null;
        }
        synchronized (this) {
            while (Thread.currentThread().isAlive() && this.looper == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.looper;
    }

    public void quitSafely() {
        taskHandler.removeCallbacksAndMessages(null);
        Looper looper = getLooper();
        if (looper != null) {
            looper.quitSafely();
        }
        this.isRunning = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            try {
                Looper myLooper = Looper.myLooper();
                this.looper = myLooper;
                if (myLooper != null) {
                    notifyAll();
                }
            } finally {
            }
        }
        if (this.looper == null) {
            Looper.prepare();
            synchronized (this) {
                this.looper = Looper.myLooper();
                notifyAll();
            }
        }
        try {
            setMessageQueue();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | InvocationTargetException e4) {
            e4.printStackTrace();
        }
        taskHandler = new Handler(getLooper()) { // from class: com.tencent.cos.xml.transfer.TaskStateMonitor.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i4 = message.what;
                if (i4 != 1) {
                    if (i4 == 2) {
                        StructMsg structMsg = (StructMsg) message.obj;
                        TaskStateMonitor.this.stateTransform(structMsg.cosxmlTask, structMsg.transferState, structMsg.exception, null, false);
                        return;
                    } else if (i4 == 3) {
                        TaskStateMonitor.this.releaseLooper();
                        return;
                    } else if (i4 == 4) {
                        StructMsg structMsg2 = (StructMsg) message.obj;
                        TaskStateMonitor.this.stateTransform(structMsg2.cosxmlTask, structMsg2.transferState, structMsg2.exception, structMsg2.result, true);
                        return;
                    } else if (i4 != 5) {
                        return;
                    }
                }
                StructMsg structMsg3 = (StructMsg) message.obj;
                TaskStateMonitor.this.stateTransform(structMsg3.cosxmlTask, structMsg3.transferState, structMsg3.exception, structMsg3.result, false);
            }
        };
        Looper.loop();
    }

    protected void sendStateMessage(COSXMLTask cOSXMLTask, TransferState transferState, Exception exc, CosXmlResult cosXmlResult, int i4) {
        Handler handler = taskHandler;
        if (handler == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i4;
        StructMsg structMsg = new StructMsg();
        structMsg.cosxmlTask = cOSXMLTask;
        structMsg.transferState = transferState;
        structMsg.exception = exc;
        structMsg.result = cosXmlResult;
        obtainMessage.obj = structMsg;
        taskHandler.sendMessage(obtainMessage);
    }

    protected void stateTransform(COSXMLTask cOSXMLTask, TransferState transferState, Exception exc, CosXmlResult cosXmlResult, boolean z4) {
        cOSXMLTask.updateState(transferState, exc, cosXmlResult, z4);
    }
}
