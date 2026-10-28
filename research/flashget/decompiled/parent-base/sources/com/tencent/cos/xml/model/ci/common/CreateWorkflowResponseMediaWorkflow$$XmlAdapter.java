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
public class CreateWorkflowResponseMediaWorkflow$$XmlAdapter extends IXmlAdapter<CreateWorkflowResponseMediaWorkflow> {
    private HashMap<String, ChildElementBinder<CreateWorkflowResponseMediaWorkflow>> childElementBinders;

    public CreateWorkflowResponseMediaWorkflow$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateWorkflowResponseMediaWorkflow>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䇲\u0001"), new ChildElementBinder<CreateWorkflowResponseMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowResponseMediaWorkflow$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowResponseMediaWorkflow.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇳\u0001"), new ChildElementBinder<CreateWorkflowResponseMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowResponseMediaWorkflow$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowResponseMediaWorkflow.workflowId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇴\u0001"), new ChildElementBinder<CreateWorkflowResponseMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowResponseMediaWorkflow$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowResponseMediaWorkflow.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇵\u0001"), new ChildElementBinder<CreateWorkflowResponseMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowResponseMediaWorkflow$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowResponseMediaWorkflow.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇶\u0001"), new ChildElementBinder<CreateWorkflowResponseMediaWorkflow>() { // from class: com.tencent.cos.xml.model.ci.common.CreateWorkflowResponseMediaWorkflow$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createWorkflowResponseMediaWorkflow.updateTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateWorkflowResponseMediaWorkflow fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow = new CreateWorkflowResponseMediaWorkflow();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateWorkflowResponseMediaWorkflow> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, createWorkflowResponseMediaWorkflow, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䇷\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return createWorkflowResponseMediaWorkflow;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return createWorkflowResponseMediaWorkflow;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateWorkflowResponseMediaWorkflow createWorkflowResponseMediaWorkflow, String str) throws IOException, XmlPullParserException {
        if (createWorkflowResponseMediaWorkflow == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䇷\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createWorkflowResponseMediaWorkflow.name != null) {
            String s4 = ProtectedSandApp.s("䇲\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createWorkflowResponseMediaWorkflow.name, xmlSerializer, "", s4);
        }
        if (createWorkflowResponseMediaWorkflow.workflowId != null) {
            String s5 = ProtectedSandApp.s("䇳\u0001");
            xmlSerializer.startTag("", s5);
            a.a(createWorkflowResponseMediaWorkflow.workflowId, xmlSerializer, "", s5);
        }
        if (createWorkflowResponseMediaWorkflow.state != null) {
            String s6 = ProtectedSandApp.s("䇴\u0001");
            xmlSerializer.startTag("", s6);
            a.a(createWorkflowResponseMediaWorkflow.state, xmlSerializer, "", s6);
        }
        if (createWorkflowResponseMediaWorkflow.createTime != null) {
            String s7 = ProtectedSandApp.s("䇵\u0001");
            xmlSerializer.startTag("", s7);
            a.a(createWorkflowResponseMediaWorkflow.createTime, xmlSerializer, "", s7);
        }
        if (createWorkflowResponseMediaWorkflow.updateTime != null) {
            String s10 = ProtectedSandApp.s("䇶\u0001");
            xmlSerializer.startTag("", s10);
            a.a(createWorkflowResponseMediaWorkflow.updateTime, xmlSerializer, "", s10);
        }
        xmlSerializer.endTag("", str);
    }
}
