package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    public View f9860b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f9859a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<Transition> f9861c = new ArrayList<>();

    @Deprecated
    public d0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f9860b == d0Var.f9860b && this.f9859a.equals(d0Var.f9859a);
    }

    public int hashCode() {
        return this.f9859a.hashCode() + (this.f9860b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        a6.append(this.f9860b);
        a6.append("\n");
        String a7 = androidx.concurrent.futures.b.a(a6.toString(), "    values:");
        for (String str : this.f9859a.keySet()) {
            a7 = a7 + "    " + str + ": " + this.f9859a.get(str) + "\n";
        }
        return a7;
    }

    public d0(@androidx.annotation.o0 View view) {
        this.f9860b = view;
    }
}
