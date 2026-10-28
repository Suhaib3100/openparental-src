package h0;

import android.view.ViewStructure;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: AndroidAutofill.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lh0/k;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "", "index", "b", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "num", "a", "(Landroid/view/ViewStructure;I)I", "id", "", "packageName", "typeName", "entryName", "Lkotlin/k2;", "d", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "left", "top", "scrollX", "scrollY", "width", "height", "c", "(Landroid/view/ViewStructure;IIIIII)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(23)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k f73922a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final int f73923b = 0;

    private k() {
    }

    @androidx.annotation.u
    @x0(23)
    public final int a(@fg.l ViewStructure structure, int num) {
        return structure.addChildCount(num);
    }

    @androidx.annotation.u
    @fg.m
    @x0(23)
    public final ViewStructure b(@fg.l ViewStructure structure, int index) {
        return structure.newChild(index);
    }

    @androidx.annotation.u
    @x0(23)
    public final void c(@fg.l ViewStructure structure, int left, int top2, int scrollX, int scrollY, int width, int height) {
        structure.setDimens(left, top2, scrollX, scrollY, width, height);
    }

    @androidx.annotation.u
    @x0(23)
    public final void d(@fg.l ViewStructure structure, int id2, @fg.m String packageName, @fg.m String typeName, @fg.m String entryName) {
        structure.setId(id2, packageName, typeName, entryName);
    }
}
