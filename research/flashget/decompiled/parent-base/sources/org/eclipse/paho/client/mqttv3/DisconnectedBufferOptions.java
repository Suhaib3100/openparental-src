package org.eclipse.paho.client.mqttv3;

/* loaded from: classes5.dex */
public class DisconnectedBufferOptions {
    public static final boolean DELETE_OLDEST_MESSAGES_DEFAULT = false;
    public static final boolean DISCONNECTED_BUFFER_ENABLED_DEFAULT = false;
    public static final int DISCONNECTED_BUFFER_SIZE_DEFAULT = 5000;
    public static final boolean PERSIST_DISCONNECTED_BUFFER_DEFAULT = false;
    private int bufferSize = 5000;
    private boolean bufferEnabled = false;
    private boolean persistBuffer = false;
    private boolean deleteOldestMessages = false;

    public int getBufferSize() {
        return this.bufferSize;
    }

    public boolean isBufferEnabled() {
        return this.bufferEnabled;
    }

    public boolean isDeleteOldestMessages() {
        return this.deleteOldestMessages;
    }

    public boolean isPersistBuffer() {
        return this.persistBuffer;
    }

    public void setBufferEnabled(boolean z4) {
        this.bufferEnabled = z4;
    }

    public void setBufferSize(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException();
        }
        this.bufferSize = i4;
    }

    public void setDeleteOldestMessages(boolean z4) {
        this.deleteOldestMessages = z4;
    }

    public void setPersistBuffer(boolean z4) {
        this.persistBuffer = z4;
    }
}
