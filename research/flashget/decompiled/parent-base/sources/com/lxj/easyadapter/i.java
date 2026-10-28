package com.lxj.easyadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ViewHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/lxj/easyadapter/i;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "convertView", "<init>", "(Landroid/view/View;)V", "T", "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "", "text", "c", "(ILjava/lang/CharSequence;)Lcom/lxj/easyadapter/i;", "resId", "b", "(II)Lcom/lxj/easyadapter/i;", "Landroid/view/View;", "a", "()Landroid/view/View;", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "mViews", "d", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final View convertView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final SparseArray<View> mViews;

    /* compiled from: ViewHolder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/lxj/easyadapter/i$a;", "", "<init>", "()V", "Landroid/view/View;", "itemView", "Lcom/lxj/easyadapter/i;", "b", "(Landroid/view/View;)Lcom/lxj/easyadapter/i;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "", "layoutId", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/lxj/easyadapter/i;", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.lxj.easyadapter.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final i a(@l Context context, @l ViewGroup parent, int layoutId) {
            l0.p(context, ProtectedSandApp.s("\u177d\u0001"));
            l0.p(parent, ProtectedSandApp.s("\u177e\u0001"));
            View inflate = LayoutInflater.from(context).inflate(layoutId, parent, false);
            l0.o(inflate, ProtectedSandApp.s("\u177f\u0001"));
            return new i(inflate);
        }

        @l
        public final i b(@l View itemView) {
            l0.p(itemView, ProtectedSandApp.s("\u177f\u0001"));
            return new i(itemView);
        }

        public Companion(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@l View view) {
        super(view);
        l0.p(view, ProtectedSandApp.s("ក\u0001"));
        this.convertView = view;
        this.mViews = new SparseArray<>();
    }

    @l
    /* renamed from: a, reason: from getter */
    public final View getConvertView() {
        return this.convertView;
    }

    @l
    public final i b(int viewId, int resId) {
        ImageView imageView = (ImageView) getView(viewId);
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
        return this;
    }

    @l
    public final i c(int viewId, @l CharSequence text) {
        l0.p(text, ProtectedSandApp.s("ខ\u0001"));
        TextView textView = (TextView) getView(viewId);
        if (textView != null) {
            textView.setText(text);
        }
        return this;
    }

    @l
    public final <T extends View> T getView(int viewId) {
        T t4 = (T) this.mViews.get(viewId);
        if (t4 == null) {
            t4 = (T) this.convertView.findViewById(viewId);
            this.mViews.put(viewId, t4);
        }
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(ProtectedSandApp.s("គ\u0001"));
    }

    @m
    public final <T extends View> T getViewOrNull(int viewId) {
        T t4 = (T) this.mViews.get(viewId);
        if (t4 == null) {
            t4 = (T) this.convertView.findViewById(viewId);
            this.mViews.put(viewId, t4);
        }
        if (t4 != null) {
            return t4;
        }
        return null;
    }
}
