package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.t;

/* compiled from: TransitionBuilder.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23672a = "TransitionBuilder";

    public static t.b a(t scene, int transitionId, int startConstraintSetId, androidx.constraintlayout.widget.d startConstraintSet, int endConstraintSetId, androidx.constraintlayout.widget.d endConstraintSet) {
        t.b bVar = new t.b(transitionId, scene, startConstraintSetId, endConstraintSetId);
        b(scene, bVar, startConstraintSet, endConstraintSet);
        return bVar;
    }

    private static void b(t scene, t.b transition, androidx.constraintlayout.widget.d startConstraintSet, androidx.constraintlayout.widget.d endConstraintSet) {
        int I = transition.I();
        int B = transition.B();
        scene.j0(I, startConstraintSet);
        scene.j0(B, endConstraintSet);
    }

    public static void c(MotionLayout layout) {
        t tVar = layout.J;
        if (tVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!tVar.s0(layout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (tVar.f23562c == null || tVar.s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
