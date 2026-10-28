package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.v;

/* compiled from: TransitionBuilder.java */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1792a = "TransitionBuilder";

    public static v.b a(v vVar, int i5, int i6, androidx.constraintlayout.widget.d dVar, int i7, androidx.constraintlayout.widget.d dVar2) {
        v.b bVar = new v.b(i5, vVar, i6, i7);
        b(vVar, bVar, dVar, dVar2);
        return bVar;
    }

    private static void b(v vVar, v.b bVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
        int G = bVar.G();
        int z5 = bVar.z();
        vVar.W(G, dVar);
        vVar.W(z5, dVar2);
    }

    public static void c(MotionLayout motionLayout) {
        v vVar = motionLayout.U;
        if (vVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!vVar.f0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (vVar.f2014c == null || vVar.o().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
