package android.content.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: p, reason: collision with root package name */
    private static final long f7160p = -7466929953374883507L;

    /* renamed from: o, reason: collision with root package name */
    private final List<String> f7161o;

    public UninitializedMessageException(h2 h2Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f7161o = null;
    }

    private static String b(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z5 = true;
        for (String str : list) {
            if (z5) {
                z5 = false;
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
        return Collections.unmodifiableList(this.f7161o);
    }

    public UninitializedMessageException(List<String> list) {
        super(b(list));
        this.f7161o = list;
    }
}
