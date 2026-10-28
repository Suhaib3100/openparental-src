package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* loaded from: classes7.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    private o f77664b;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f77664b = null;
    }

    static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皨\u0001"));
    }

    static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皩\u0001"));
    }

    static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皪\u0001"));
    }

    static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皫\u0001"));
    }

    static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皬\u0001"));
    }

    static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皭\u0001"));
    }

    static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皮\u0001"));
    }

    static InvalidProtocolBufferException j() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皯\u0001"));
    }

    static InvalidProtocolBufferException k() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("皰\u0001"));
    }

    public o a() {
        return this.f77664b;
    }

    public InvalidProtocolBufferException i(o oVar) {
        this.f77664b = oVar;
        return this;
    }
}
