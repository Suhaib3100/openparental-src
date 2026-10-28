package org.eclipse.paho.client.mqttv3;

import java.io.UnsupportedEncodingException;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.util.Strings;

/* loaded from: classes5.dex */
public class MqttTopic {
    private static final int MAX_TOPIC_LEN = 65535;
    private static final int MIN_TOPIC_LEN = 1;
    private static final char NUL = 0;
    private ClientComms comms;
    private String name;
    public static final String MULTI_LEVEL_WILDCARD = "#";
    public static final String TOPIC_WILDCARDS = "#+";
    public static final String SINGLE_LEVEL_WILDCARD = "+";
    public static final String TOPIC_LEVEL_SEPARATOR = "/";
    public static final String MULTI_LEVEL_WILDCARD_PATTERN = "/#";

    public MqttTopic(String str, ClientComms clientComms) {
        this.comms = clientComms;
        this.name = str;
    }

    private MqttPublish createPublish(MqttMessage mqttMessage) {
        return new MqttPublish(getName(), mqttMessage);
    }

    public static boolean isMatched(String str, String str2) throws IllegalArgumentException {
        int length = str2.length();
        int length2 = str.length();
        validate(str, true);
        validate(str2, false);
        if (str.equals(str2)) {
            return true;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < length2 && i5 < length && ((str2.charAt(i5) != '/' || str.charAt(i4) == '/') && (str.charAt(i4) == '+' || str.charAt(i4) == '#' || str.charAt(i4) == str2.charAt(i5)))) {
            if (str.charAt(i4) == '+') {
                int i6 = i5 + 1;
                while (i6 < length && str2.charAt(i6) != '/') {
                    i6 = i5 + 2;
                    i5++;
                }
            } else if (str.charAt(i4) == '#') {
                i5 = length - 1;
            }
            i4++;
            i5++;
        }
        return i5 == length && i4 == length2;
    }

    public static void validate(String str, boolean z4) throws IllegalArgumentException {
        try {
            int length = str.getBytes("UTF-8").length;
            if (length < 1 || length > 65535) {
                throw new IllegalArgumentException(String.format("Invalid topic length, should be in range[%d, %d]!", new Integer(1), new Integer(65535)));
            }
            if (!z4) {
                if (Strings.containsAny(str, "#+")) {
                    throw new IllegalArgumentException("The topic name MUST NOT contain any wildcard characters (#+)");
                }
            } else {
                if (Strings.equalsAny(str, new String[]{"#", "+"})) {
                    return;
                }
                if (Strings.countMatches(str, "#") > 1 || (str.contains("#") && !str.endsWith("/#"))) {
                    throw new IllegalArgumentException("Invalid usage of multi-level wildcard in topic string: ".concat(str));
                }
                validateSingleLevelWildcard(str);
            }
        } catch (UnsupportedEncodingException e4) {
            throw new IllegalStateException(e4.getMessage());
        }
    }

    private static void validateSingleLevelWildcard(String str) {
        char charAt = "+".charAt(0);
        char charAt2 = "/".charAt(0);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 - 1;
            char c5 = i5 >= 0 ? charArray[i5] : (char) 0;
            int i6 = i4 + 1;
            char c6 = i6 < length ? charArray[i6] : (char) 0;
            if (charArray[i4] == charAt && ((c5 != charAt2 && c5 != 0) || (c6 != charAt2 && c6 != 0))) {
                throw new IllegalArgumentException(String.format("Invalid usage of single-level wildcard in topic string '%s'!", str));
            }
            i4 = i6;
        }
    }

    public String getName() {
        return this.name;
    }

    public MqttDeliveryToken publish(byte[] bArr, int i4, boolean z4) throws MqttException, MqttPersistenceException {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i4);
        mqttMessage.setRetained(z4);
        return publish(mqttMessage);
    }

    public String toString() {
        return getName();
    }

    public MqttDeliveryToken publish(MqttMessage mqttMessage) throws MqttException, MqttPersistenceException {
        MqttDeliveryToken mqttDeliveryToken = new MqttDeliveryToken(this.comms.getClient().getClientId());
        mqttDeliveryToken.setMessage(mqttMessage);
        this.comms.sendNoWait(createPublish(mqttMessage), mqttDeliveryToken);
        mqttDeliveryToken.internalTok.waitUntilSent();
        return mqttDeliveryToken;
    }
}
