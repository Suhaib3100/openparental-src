package androidx.work;

import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.List;

/* compiled from: InputMerger.java */
/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36602a = s.f("InputMerger");

    @c1({c1.a.LIBRARY_GROUP})
    public static o a(String className) {
        try {
            return (o) Class.forName(className).newInstance();
        } catch (Exception e4) {
            s.c().b(f36602a, androidx.constraintlayout.core.motion.key.c.a("Trouble instantiating + ", className), e4);
            return null;
        }
    }

    @o0
    public abstract f b(@o0 List<f> inputs);
}
