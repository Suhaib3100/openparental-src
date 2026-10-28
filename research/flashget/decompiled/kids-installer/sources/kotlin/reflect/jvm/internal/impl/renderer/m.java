package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes5.dex */
public enum m {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.m.b
        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        @d5.d
        public String escape(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("兆"));
            return str;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.m.a
        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        @d5.d
        public String escape(@d5.d String str) {
            String i22;
            String i23;
            l0.p(str, ProtectedSandApp.s("允"));
            i22 = e0.i2(str, ProtectedSandApp.s("兂"), ProtectedSandApp.s("元"), false, 4, null);
            i23 = e0.i2(i22, ProtectedSandApp.s("兄"), ProtectedSandApp.s("充"), false, 4, null);
            return i23;
        }
    };

    /* synthetic */ m(w wVar) {
        this();
    }

    @d5.d
    public abstract String escape(@d5.d String str);
}
