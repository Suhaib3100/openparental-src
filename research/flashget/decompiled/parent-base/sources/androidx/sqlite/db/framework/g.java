package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FrameworkSQLiteProgram.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/sqlite/db/framework/g;", "Lf3/f;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", "index", "Lkotlin/k2;", "h3", "(I)V", "", "value", "C2", "(IJ)V", "", "k0", "(ID)V", "", "c2", "(ILjava/lang/String;)V", "", "L2", "(I[B)V", "C3", "()V", "close", "b", "Landroid/database/sqlite/SQLiteProgram;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class g implements f3.f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final SQLiteProgram delegate;

    public g(@l SQLiteProgram delegate) {
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // f3.f
    public void C2(int index, long value) {
        this.delegate.bindLong(index, value);
    }

    @Override // f3.f
    public void C3() {
        this.delegate.clearBindings();
    }

    @Override // f3.f
    public void L2(int index, @l byte[] value) {
        l0.p(value, "value");
        this.delegate.bindBlob(index, value);
    }

    @Override // f3.f
    public void c2(int index, @l String value) {
        l0.p(value, "value");
        this.delegate.bindString(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // f3.f
    public void h3(int index) {
        this.delegate.bindNull(index);
    }

    @Override // f3.f
    public void k0(int index, double value) {
        this.delegate.bindDouble(index, value);
    }
}
