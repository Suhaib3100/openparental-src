package org.webrtc;

import androidx.compose.material3.j4;
import java.util.Map;

/* loaded from: classes9.dex */
public class RTCStats {

    /* renamed from: id, reason: collision with root package name */
    private final String f88475id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j4, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j4;
        this.type = str;
        this.f88475id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb.append(obj);
                return;
            }
            sb.append(kotlin.text.m0.quote);
            sb.append(obj);
            sb.append(kotlin.text.m0.quote);
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append('[');
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (i4 != 0) {
                sb.append(", ");
            }
            appendValue(sb, objArr[i4]);
        }
        sb.append(']');
    }

    @CalledByNative
    static RTCStats create(long j4, String str, String str2, Map map) {
        return new RTCStats(j4, str, str2, map);
    }

    public String getId() {
        return this.f88475id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder a5 = j4.a("{ timestampUs: ");
        a5.append(this.timestampUs);
        a5.append(", type: ");
        a5.append(this.type);
        a5.append(", id: ");
        a5.append(this.f88475id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            a5.append(", ");
            a5.append(entry.getKey());
            a5.append(": ");
            appendValue(a5, entry.getValue());
        }
        a5.append(" }");
        return a5.toString();
    }
}
