package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.c2;
import androidx.room.g2;
import androidx.view.LiveData;
import androidx.work.impl.model.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: RawWorkInfoDao_Impl.java */
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f36319a;

    /* compiled from: RawWorkInfoDao_Impl.java */
    class a implements Callable<List<r.c>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.g f36320a;

        a(final f3.g val$_internalQuery) {
            this.f36320a = val$_internalQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<r.c> call() throws Exception {
            Cursor f4 = androidx.room.util.b.f(h.this.f36319a, this.f36320a, true, null);
            try {
                int d5 = androidx.room.util.a.d(f4, "id");
                int d6 = androidx.room.util.a.d(f4, "state");
                int d7 = androidx.room.util.a.d(f4, "output");
                int d10 = androidx.room.util.a.d(f4, "run_attempt_count");
                androidx.collection.a aVar = new androidx.collection.a();
                androidx.collection.a aVar2 = new androidx.collection.a();
                while (f4.moveToNext()) {
                    if (!f4.isNull(d5)) {
                        String string = f4.getString(d5);
                        if (((ArrayList) aVar.get(string)) == null) {
                            aVar.put(string, new ArrayList());
                        }
                    }
                    if (!f4.isNull(d5)) {
                        String string2 = f4.getString(d5);
                        if (((ArrayList) aVar2.get(string2)) == null) {
                            aVar2.put(string2, new ArrayList());
                        }
                    }
                }
                f4.moveToPosition(-1);
                h.this.d(aVar);
                h.this.c(aVar2);
                ArrayList arrayList = new ArrayList(f4.getCount());
                while (f4.moveToNext()) {
                    ArrayList arrayList2 = !f4.isNull(d5) ? (ArrayList) aVar.get(f4.getString(d5)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !f4.isNull(d5) ? (ArrayList) aVar2.get(f4.getString(d5)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    r.c cVar = new r.c();
                    if (d5 != -1) {
                        cVar.f36366a = f4.getString(d5);
                    }
                    if (d6 != -1) {
                        cVar.f36367b = x.g(f4.getInt(d6));
                    }
                    if (d7 != -1) {
                        cVar.f36368c = androidx.work.f.m(f4.getBlob(d7));
                    }
                    if (d10 != -1) {
                        cVar.f36369d = f4.getInt(d10);
                    }
                    cVar.f36370e = arrayList2;
                    cVar.f36371f = arrayList3;
                    arrayList.add(cVar);
                }
                f4.close();
                return arrayList;
            } catch (Throwable th) {
                f4.close();
                throw th;
            }
        }
    }

    public h(c2 __db) {
        this.f36319a = __db;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final androidx.collection.a<String, ArrayList<androidx.work.f>> _map) {
        ArrayList<androidx.work.f> arrayList;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.f>> aVar = new androidx.collection.a<>(999);
            int size = _map.getSize();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                aVar.put(_map.keyAt(i4), _map.valueAt(i4));
                i4++;
                i5++;
                if (i5 == 999) {
                    c(aVar);
                    aVar = new androidx.collection.a<>(999);
                    i5 = 0;
                }
            }
            if (i5 > 0) {
                c(aVar);
                return;
            }
            return;
        }
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.f.a(d5, size2);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size2);
        int i6 = 1;
        for (String str : keySet) {
            if (str == null) {
                d6.h3(i6);
            } else {
                d6.c2(i6, str);
            }
            i6++;
        }
        Cursor f4 = androidx.room.util.b.f(this.f36319a, d6, false, null);
        try {
            int d7 = androidx.room.util.a.d(f4, "work_spec_id");
            if (d7 == -1) {
                return;
            }
            while (f4.moveToNext()) {
                if (!f4.isNull(d7) && (arrayList = _map.get(f4.getString(d7))) != null) {
                    arrayList.add(androidx.work.f.m(f4.getBlob(0)));
                }
            }
        } finally {
            f4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final androidx.collection.a<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>(999);
            int size = _map.getSize();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                aVar.put(_map.keyAt(i4), _map.valueAt(i4));
                i4++;
                i5++;
                if (i5 == 999) {
                    d(aVar);
                    aVar = new androidx.collection.a<>(999);
                    i5 = 0;
                }
            }
            if (i5 > 0) {
                d(aVar);
                return;
            }
            return;
        }
        StringBuilder d5 = androidx.room.util.f.d();
        d5.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.f.a(d5, size2);
        d5.append(")");
        g2 d6 = g2.d(d5.toString(), size2);
        int i6 = 1;
        for (String str : keySet) {
            if (str == null) {
                d6.h3(i6);
            } else {
                d6.c2(i6, str);
            }
            i6++;
        }
        Cursor f4 = androidx.room.util.b.f(this.f36319a, d6, false, null);
        try {
            int d7 = androidx.room.util.a.d(f4, "work_spec_id");
            if (d7 == -1) {
                return;
            }
            while (f4.moveToNext()) {
                if (!f4.isNull(d7) && (arrayList = _map.get(f4.getString(d7))) != null) {
                    arrayList.add(f4.getString(0));
                }
            }
        } finally {
            f4.close();
        }
    }

    @Override // androidx.work.impl.model.g
    public LiveData<List<r.c>> a(final f3.g query) {
        return this.f36319a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(query));
    }

    @Override // androidx.work.impl.model.g
    public List<r.c> b(final f3.g query) {
        this.f36319a.assertNotSuspendingTransaction();
        Cursor f4 = androidx.room.util.b.f(this.f36319a, query, true, null);
        try {
            int d5 = androidx.room.util.a.d(f4, "id");
            int d6 = androidx.room.util.a.d(f4, "state");
            int d7 = androidx.room.util.a.d(f4, "output");
            int d10 = androidx.room.util.a.d(f4, "run_attempt_count");
            androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
            androidx.collection.a<String, ArrayList<androidx.work.f>> aVar2 = new androidx.collection.a<>();
            while (f4.moveToNext()) {
                if (!f4.isNull(d5)) {
                    String string = f4.getString(d5);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                }
                if (!f4.isNull(d5)) {
                    String string2 = f4.getString(d5);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
            }
            f4.moveToPosition(-1);
            d(aVar);
            c(aVar2);
            ArrayList arrayList = new ArrayList(f4.getCount());
            while (f4.moveToNext()) {
                ArrayList<String> arrayList2 = !f4.isNull(d5) ? aVar.get(f4.getString(d5)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<androidx.work.f> arrayList3 = !f4.isNull(d5) ? aVar2.get(f4.getString(d5)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                r.c cVar = new r.c();
                if (d5 != -1) {
                    cVar.f36366a = f4.getString(d5);
                }
                if (d6 != -1) {
                    cVar.f36367b = x.g(f4.getInt(d6));
                }
                if (d7 != -1) {
                    cVar.f36368c = androidx.work.f.m(f4.getBlob(d7));
                }
                if (d10 != -1) {
                    cVar.f36369d = f4.getInt(d10);
                }
                cVar.f36370e = arrayList2;
                cVar.f36371f = arrayList3;
                arrayList.add(cVar);
            }
            f4.close();
            return arrayList;
        } catch (Throwable th) {
            f4.close();
            throw th;
        }
    }
}
