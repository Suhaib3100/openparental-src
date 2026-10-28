package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* loaded from: classes3.dex */
public class c<D> {
    Context mContext;
    int mId;
    InterfaceC0508c<D> mListener;
    b<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* compiled from: Loader.java */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            c.this.onContentChanged();
        }
    }

    /* compiled from: Loader.java */
    public interface b<D> {
        void a(@o0 c<D> cVar);
    }

    /* compiled from: Loader.java */
    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public interface InterfaceC0508c<D> {
        void a(@o0 c<D> cVar, @q0 D d5);
    }

    public c(@o0 Context context) {
        this.mContext = context.getApplicationContext();
    }

    @l0
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @l0
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @o0
    public String dataToString(@q0 D d5) {
        StringBuilder sb = new StringBuilder(64);
        i.a(d5, sb);
        sb.append("}");
        return sb.toString();
    }

    @l0
    public void deliverCancellation() {
        b<D> bVar = this.mOnLoadCanceledListener;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @l0
    public void deliverResult(@q0 D d5) {
        InterfaceC0508c<D> interfaceC0508c = this.mListener;
        if (interfaceC0508c != null) {
            interfaceC0508c.a(this, d5);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    @l0
    public void forceLoad() {
        onForceLoad();
    }

    @o0
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @l0
    protected void onAbandon() {
    }

    @l0
    protected boolean onCancelLoad() {
        return false;
    }

    @l0
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @l0
    protected void onForceLoad() {
    }

    @l0
    protected void onReset() {
    }

    @l0
    protected void onStartLoading() {
    }

    @l0
    protected void onStopLoading() {
    }

    @l0
    public void registerListener(int i4, @o0 InterfaceC0508c<D> interfaceC0508c) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC0508c;
        this.mId = i4;
    }

    @l0
    public void registerOnLoadCanceledListener(@o0 b<D> bVar) {
        if (this.mOnLoadCanceledListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = bVar;
    }

    @l0
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @l0
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @l0
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z4 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z4;
        return z4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        i.a(this, sb);
        sb.append(" id=");
        return android.support.v4.media.b.a(sb, this.mId, "}");
    }

    @l0
    public void unregisterListener(@o0 InterfaceC0508c<D> interfaceC0508c) {
        InterfaceC0508c<D> interfaceC0508c2 = this.mListener;
        if (interfaceC0508c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0508c2 != interfaceC0508c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    @l0
    public void unregisterOnLoadCanceledListener(@o0 b<D> bVar) {
        b<D> bVar2 = this.mOnLoadCanceledListener;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }
}
