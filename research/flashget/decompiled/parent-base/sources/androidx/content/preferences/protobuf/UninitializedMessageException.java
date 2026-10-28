package androidx.content.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f28614c = -7466929953374883507L;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f28615b;

    public UninitializedMessageException(i2 i2Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f28615b = null;
    }

    private static String b(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z4 = true;
        for (String str : list) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> c() {
        return Collections.unmodifiableList(this.f28615b);
    }

    public UninitializedMessageException(List<String> list) {
        super(b(list));
        this.f28615b = list;
    }
}
