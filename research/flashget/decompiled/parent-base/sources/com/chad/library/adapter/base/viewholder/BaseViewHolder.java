package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.n;
import androidx.annotation.v;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: BaseViewHolder.kt */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u0002*\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0016J#\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J#\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J#\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0016J#\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u0016J!\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J!\u0010/\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/databinding/ViewDataBinding;", "B", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "T", "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "findView", "", "value", "setText", "(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "strId", "(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "color", "setTextColor", "colorRes", "setTextColorRes", "imageResId", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(ILandroid/graphics/drawable/Drawable;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(ILandroid/graphics/Bitmap;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setBackgroundColor", "backgroundRes", "setBackgroundResource", "", "isVisible", "setVisible", "(IZ)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "isGone", "setGone", "isEnabled", "setEnabled", "Landroid/util/SparseArray;", "views", "Landroid/util/SparseArray;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class BaseViewHolder extends RecyclerView.e0 {
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(@l View view) {
        super(view);
        l0.q(view, ProtectedSandApp.s("໋"));
        this.views = new SparseArray<>();
    }

    @m
    public <T extends View> T findView(int i4) {
        return (T) this.itemView.findViewById(i4);
    }

    @m
    @k(message = "Please use BaseDataBindingHolder class", replaceWith = @x0(expression = "DataBindingUtil.getBinding(itemView)", imports = {"androidx.databinding.DataBindingUtil"}))
    public <B extends ViewDataBinding> B getBinding() {
        return (B) DataBindingUtil.getBinding(this.itemView);
    }

    @l
    public <T extends View> T getView(@d0 int viewId) {
        T t4 = (T) getViewOrNull(viewId);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException(a.a(ProtectedSandApp.s("໌"), viewId).toString());
    }

    @m
    public <T extends View> T getViewOrNull(@d0 int viewId) {
        T t4;
        T t5 = (T) this.views.get(viewId);
        if (t5 == null && (t4 = (T) this.itemView.findViewById(viewId)) != null) {
            this.views.put(viewId, t4);
            return t4;
        }
        if (t5 == null) {
            return null;
        }
        return t5;
    }

    @l
    public BaseViewHolder setBackgroundColor(@d0 int viewId, @androidx.annotation.l int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    @l
    public BaseViewHolder setBackgroundResource(@d0 int viewId, @v int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    @l
    public BaseViewHolder setEnabled(@d0 int viewId, boolean isEnabled) {
        getView(viewId).setEnabled(isEnabled);
        return this;
    }

    @l
    public BaseViewHolder setGone(@d0 int viewId, boolean isGone) {
        getView(viewId).setVisibility(isGone ? 8 : 0);
        return this;
    }

    @l
    public BaseViewHolder setImageBitmap(@d0 int viewId, @m Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    @l
    public BaseViewHolder setImageDrawable(@d0 int viewId, @m Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    @l
    public BaseViewHolder setImageResource(@d0 int viewId, @v int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    @l
    public BaseViewHolder setText(@d0 int viewId, @m CharSequence value) {
        ((TextView) getView(viewId)).setText(value);
        return this;
    }

    @l
    public BaseViewHolder setTextColor(@d0 int viewId, @androidx.annotation.l int color) {
        ((TextView) getView(viewId)).setTextColor(color);
        return this;
    }

    @l
    public BaseViewHolder setTextColorRes(@d0 int viewId, @n int colorRes) {
        TextView textView = (TextView) getView(viewId);
        View view = this.itemView;
        l0.h(view, ProtectedSandApp.s("ໍ"));
        textView.setTextColor(view.getResources().getColor(colorRes));
        return this;
    }

    @l
    public BaseViewHolder setVisible(@d0 int viewId, boolean isVisible) {
        getView(viewId).setVisibility(isVisible ? 0 : 4);
        return this;
    }

    @m
    public BaseViewHolder setText(@d0 int viewId, @g1 int strId) {
        ((TextView) getView(viewId)).setText(strId);
        return this;
    }
}
