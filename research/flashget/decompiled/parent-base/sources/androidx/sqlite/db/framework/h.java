package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FrameworkSQLiteStatement.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/sqlite/db/framework/h;", "Landroidx/sqlite/db/framework/g;", "Lf3/i;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "Lkotlin/k2;", "j", "()V", "", "h0", "()I", "", "P1", "()J", "Y1", "", "R0", "()Ljava/lang/String;", "c", "Landroid/database/sqlite/SQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends g implements f3.i {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@l SQLiteStatement delegate) {
        super(delegate);
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // f3.i
    public long P1() {
        return this.delegate.executeInsert();
    }

    @Override // f3.i
    @m
    public String R0() {
        return this.delegate.simpleQueryForString();
    }

    @Override // f3.i
    public long Y1() {
        return this.delegate.simpleQueryForLong();
    }

    @Override // f3.i
    public int h0() {
        return this.delegate.executeUpdateDelete();
    }

    @Override // f3.i
    public void j() {
        this.delegate.execute();
    }
}
