package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;

/* compiled from: MenuHost.java */
/* loaded from: classes3.dex */
public interface n0 {
    void addMenuProvider(@androidx.annotation.o0 t0 t0Var);

    void addMenuProvider(@androidx.annotation.o0 t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@androidx.annotation.o0 t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0, @androidx.annotation.o0 AbstractC1450w.b bVar);

    void invalidateMenu();

    void removeMenuProvider(@androidx.annotation.o0 t0 t0Var);
}
