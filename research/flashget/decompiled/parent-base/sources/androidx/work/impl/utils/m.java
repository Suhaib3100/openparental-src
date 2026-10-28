package androidx.work.impl.utils;

import androidx.annotation.o0;
import androidx.work.f0;
import androidx.work.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: RawQueries.java */
/* loaded from: classes3.dex */
public final class m {
    private m() {
    }

    private static void a(@o0 StringBuilder builder, int count) {
        if (count <= 0) {
            return;
        }
        builder.append("?");
        for (int i4 = 1; i4 < count; i4++) {
            builder.append(",");
            builder.append("?");
        }
    }

    @o0
    public static f3.g b(@o0 h0 querySpec) {
        String str;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<f0.a> b5 = querySpec.b();
        String str2 = " AND";
        if (b5.isEmpty()) {
            str = " WHERE";
        } else {
            ArrayList arrayList2 = new ArrayList(b5.size());
            Iterator<f0.a> it = b5.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(androidx.work.impl.model.x.j(it.next())));
            }
            sb.append(" WHERE state IN (");
            a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        List<UUID> a5 = querySpec.a();
        if (!a5.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(a5.size());
            Iterator<UUID> it2 = a5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb.append(str);
            sb.append(" id IN (");
            a(sb, a5.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        List<String> c5 = querySpec.c();
        if (c5.isEmpty()) {
            str2 = str;
        } else {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb, c5.size());
            sb.append("))");
            arrayList.addAll(c5);
        }
        List<String> d5 = querySpec.d();
        if (!d5.isEmpty()) {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb, d5.size());
            sb.append("))");
            arrayList.addAll(d5);
        }
        sb.append(";");
        return new f3.b(sb.toString(), arrayList.toArray());
    }
}
