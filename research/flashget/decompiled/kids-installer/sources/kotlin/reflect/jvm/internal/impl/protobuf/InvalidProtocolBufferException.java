package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* loaded from: classes5.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: o, reason: collision with root package name */
    private o f25682o;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f25682o = null;
    }

    static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伣"));
    }

    static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伤"));
    }

    static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伥"));
    }

    static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伦"));
    }

    static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伧"));
    }

    static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伨"));
    }

    static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伩"));
    }

    static InvalidProtocolBufferException j() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伪"));
    }

    static InvalidProtocolBufferException k() {
        return new InvalidProtocolBufferException(ProtectedSandApp.s("伫"));
    }

    public o a() {
        return this.f25682o;
    }

    public InvalidProtocolBufferException i(o oVar) {
        this.f25682o = oVar;
        return this;
    }
}
