package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttException;

/* loaded from: classes5.dex */
public class MqttPubComp extends MqttAck {
    public MqttPubComp(byte b5, byte[] bArr) throws IOException {
        super((byte) 7);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.msgId = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    protected byte[] getVariableHeader() throws MqttException {
        return encodeMessageId();
    }

    public MqttPubComp(MqttPublish mqttPublish) {
        super((byte) 7);
        this.msgId = mqttPublish.getMessageId();
    }

    public MqttPubComp(int i4) {
        super((byte) 7);
        this.msgId = i4;
    }
}
