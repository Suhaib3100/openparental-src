package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f77665b;

    public UninitializedMessageException(o oVar) {
        super(ProtectedSandApp.s("皱\u0001"));
        this.f77665b = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
