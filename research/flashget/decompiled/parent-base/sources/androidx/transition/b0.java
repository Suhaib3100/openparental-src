package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: b, reason: collision with root package name */
    public View f34364b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f34363a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<Transition> f34365c = new ArrayList<>();

    @Deprecated
    public b0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f34364b == b0Var.f34364b && this.f34363a.equals(b0Var.f34363a);
    }

    public int hashCode() {
        return this.f34363a.hashCode() + (this.f34364b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a5 = androidx.constraintlayout.core.e.a("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        a5.append(this.f34364b);
        a5.append("\n");
        String a6 = androidx.compose.runtime.changelist.j.a(a5.toString(), "    values:");
        for (String str : this.f34363a.keySet()) {
            a6 = a6 + "    " + str + ": " + this.f34363a.get(str) + "\n";
        }
        return a6;
    }

    public b0(@androidx.annotation.o0 View view) {
        this.f34364b = view;
    }
}
