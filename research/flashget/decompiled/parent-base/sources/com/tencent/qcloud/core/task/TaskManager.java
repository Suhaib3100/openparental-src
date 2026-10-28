package com.tencent.qcloud.core.task;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.logger.COSLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class TaskManager {
    static final String TASK_LOG_TAG = ProtectedSandApp.s("媪\u0001");
    private static volatile TaskManager instance;
    private Map<String, QCloudTask> taskPool = new ConcurrentHashMap(30);

    private TaskManager() {
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            synchronized (TaskManager.class) {
                try {
                    if (instance == null) {
                        instance = new TaskManager();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    void add(QCloudTask qCloudTask) {
        this.taskPool.put(qCloudTask.getIdentifier(), qCloudTask);
        COSLogger.dProcess(ProtectedSandApp.s("媪\u0001"), ProtectedSandApp.s("媫\u0001"), qCloudTask.getIdentifier(), Integer.valueOf(this.taskPool.size()));
    }

    void evict() {
        COSLogger.dProcess(ProtectedSandApp.s("媪\u0001"), ProtectedSandApp.s("媬\u0001"), Integer.valueOf(this.taskPool.size()));
        this.taskPool.clear();
    }

    public QCloudTask get(String str) {
        return this.taskPool.get(str);
    }

    public int getPoolCount() {
        return this.taskPool.size();
    }

    void remove(QCloudTask qCloudTask) {
        if (this.taskPool.remove(qCloudTask.getIdentifier()) != null) {
            COSLogger.dProcess(ProtectedSandApp.s("媪\u0001"), ProtectedSandApp.s("媭\u0001"), qCloudTask.getIdentifier(), Integer.valueOf(this.taskPool.size()));
        }
    }

    public List<QCloudTask> snapshot() {
        return new ArrayList(this.taskPool.values());
    }
}
