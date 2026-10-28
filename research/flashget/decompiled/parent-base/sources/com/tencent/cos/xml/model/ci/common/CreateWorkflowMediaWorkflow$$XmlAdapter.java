package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateWorkflowMediaWorkflow$$XmlAdapter extends IXmlAdapter<CreateWorkflowMediaWorkflow> {
    private HashMap<String, ChildElementBinder<CreateWorkflowMediaWorkflow>> childElementBinders;

    public CreateWorkflowMediaWorkflow$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateWorkflowMediaWorkflow>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䇯\u0001"), new ChildElementBinder<CreateWorkflowMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowMediaWorkflow$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowMediaWorkflow createWorkflowMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowMediaWorkflow.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇰\u0001"), new ChildElementBinder<CreateWorkflowMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowMediaWorkflow$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowMediaWorkflow createWorkflowMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowMediaWorkflow.state = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateWorkflowMediaWorkflow fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateWorkflowMediaWorkflow createWorkflowMediaWorkflow = new CreateWorkflowMediaWorkflow();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateWorkflowMediaWorkflow> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, createWorkflowMediaWorkflow, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䇱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return createWorkflowMediaWorkflow;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return createWorkflowMediaWorkflow;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateWorkflowMediaWorkflow createWorkflowMediaWorkflow, String str) throws IOException, XmlPullParserException {
        if (createWorkflowMediaWorkflow == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䇱\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createWorkflowMediaWorkflow.name != null) {
            String s4 = ProtectedSandApp.s("䇯\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createWorkflowMediaWorkflow.name, xmlSerializer, "", s4);
        }
        if (createWorkflowMediaWorkflow.state != null) {
            String s5 = ProtectedSandApp.s("䇰\u0001");
            xmlSerializer.startTag("", s5);
            a.a(createWorkflowMediaWorkflow.state, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
