package com.chad.library.adapter.base.delegate;

import android.util.SparseIntArray;
import androidx.annotation.j0;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseMultiTypeDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\b\u0001\u0010\u001a\u001a\u00020\u0019\"\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"¨\u0006#"}, d2 = {"Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "T", "", "Landroid/util/SparseIntArray;", "layouts", "<init>", "(Landroid/util/SparseIntArray;)V", "", "type", "layoutResId", "Lkotlin/k2;", "registerItemType", "(II)V", "", "mode", "checkMode", "(Z)V", "", "data", "position", "getItemType", "(Ljava/util/List;I)I", "viewType", "getLayoutId", "(I)I", "", "layoutResIds", "addItemTypeAutoIncrease", "([I)Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "addItemType", "(II)Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "autoMode", "Z", "selfMode", "Landroid/util/SparseIntArray;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseMultiTypeDelegate<T> {
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiTypeDelegate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void checkMode(boolean mode) {
        if (mode) {
            throw new IllegalArgumentException(ProtectedSandApp.s("໘"));
        }
    }

    private final void registerItemType(int type, @j0 int layoutResId) {
        this.layouts.put(type, layoutResId);
    }

    @l
    public final BaseMultiTypeDelegate<T> addItemType(int type, @j0 int layoutResId) {
        this.selfMode = true;
        checkMode(this.autoMode);
        registerItemType(type, layoutResId);
        return this;
    }

    @l
    public final BaseMultiTypeDelegate<T> addItemTypeAutoIncrease(@l @j0 int... layoutResIds) {
        l0.q(layoutResIds, ProtectedSandApp.s("໙"));
        this.autoMode = true;
        checkMode(this.selfMode);
        int length = layoutResIds.length;
        for (int i4 = 0; i4 < length; i4++) {
            registerItemType(i4, layoutResIds[i4]);
        }
        return this;
    }

    public abstract int getItemType(@l List<? extends T> data, int position);

    public final int getLayoutId(int viewType) {
        int i4 = this.layouts.get(viewType);
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("\u0eda"), viewType, ProtectedSandApp.s("\u0edb")).toString());
    }

    public BaseMultiTypeDelegate(@l SparseIntArray sparseIntArray) {
        l0.q(sparseIntArray, ProtectedSandApp.s("໗"));
        this.layouts = sparseIntArray;
    }

    public /* synthetic */ BaseMultiTypeDelegate(SparseIntArray sparseIntArray, int i4, w wVar) {
        this((i4 & 1) != 0 ? new SparseIntArray() : sparseIntArray);
    }
}
