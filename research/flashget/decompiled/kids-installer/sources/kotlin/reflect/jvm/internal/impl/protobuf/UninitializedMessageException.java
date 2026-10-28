package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* loaded from: classes5.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final List<String> f25683o;

    public UninitializedMessageException(o oVar) {
        super(ProtectedSandApp.s("伬"));
        this.f25683o = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
