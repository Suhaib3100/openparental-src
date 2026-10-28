package org.webrtc;

/* loaded from: classes9.dex */
public class StatsReport {

    /* renamed from: id, reason: collision with root package name */
    public final String f88477id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.name);
            sb.append(": ");
            return android.support.v4.media.c.a(sb, this.value, "]");
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d5, Value[] valueArr) {
        this.f88477id = str;
        this.type = str2;
        this.timestamp = d5;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("id: ");
        sb.append(this.f88477id);
        sb.append(", type: ");
        sb.append(this.type);
        sb.append(", timestamp: ");
        sb.append(this.timestamp);
        sb.append(", values: ");
        int i4 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i4 >= valueArr.length) {
                return sb.toString();
            }
            sb.append(valueArr[i4].toString());
            sb.append(", ");
            i4++;
        }
    }
}
