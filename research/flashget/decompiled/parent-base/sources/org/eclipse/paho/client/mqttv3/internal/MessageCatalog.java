package org.eclipse.paho.client.mqttv3.internal;

/* loaded from: classes5.dex */
public abstract class MessageCatalog {
    private static MessageCatalog INSTANCE;

    public static final String getMessage(int i4) {
        if (INSTANCE == null) {
            if (ExceptionHelper.isClassAvailable("java.util.ResourceBundle")) {
                try {
                    INSTANCE = (MessageCatalog) ResourceBundleCatalog.class.newInstance();
                } catch (Exception unused) {
                    return "";
                }
            } else if (ExceptionHelper.isClassAvailable("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog")) {
                try {
                    INSTANCE = (MessageCatalog) Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog").newInstance();
                } catch (Exception unused2) {
                    return "";
                }
            }
        }
        return INSTANCE.getLocalizedMessage(i4);
    }

    protected abstract String getLocalizedMessage(int i4);
}
