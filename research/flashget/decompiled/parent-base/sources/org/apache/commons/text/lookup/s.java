package org.apache.commons.text.lookup;

import java.util.Objects;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/* compiled from: ScriptStringLookup.java */
/* loaded from: classes3.dex */
final class s extends a {

    /* renamed from: c, reason: collision with root package name */
    static final s f86543c = new s();

    private s() {
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(a.f86486b, 2);
        if (split.length != 2) {
            throw l.a("Bad script key format [%s]; expected format is EngineName:Script.", str);
        }
        String str2 = split[0];
        String str3 = split[1];
        try {
            ScriptEngine engineByName = new ScriptEngineManager().getEngineByName(str2);
            if (engineByName != null) {
                return Objects.toString(engineByName.eval(str3), null);
            }
            throw new IllegalArgumentException("No script engine named " + str2);
        } catch (Exception e4) {
            throw l.b(e4, "Error in script engine [%s] evaluating script [%s].", str2, str3);
        }
    }
}
