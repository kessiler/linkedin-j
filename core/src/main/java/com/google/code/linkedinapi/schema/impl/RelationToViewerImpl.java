/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.AvailableActions;
import com.google.code.linkedinapi.schema.MembershipState;
import com.google.code.linkedinapi.schema.RelatedConnections;
import com.google.code.linkedinapi.schema.RelationToViewer;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "relatedConnections",
    "distance",
    "membershipState",
    "isFollowing",
    "isLiked",
    "availableActions"
})
@XmlRootElement(name = "relation-to-viewer")
public class RelationToViewerImpl
    implements Serializable, RelationToViewer
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "related-connections", required = true, type = RelatedConnectionsImpl.class)
    protected RelatedConnectionsImpl relatedConnections;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long distance;
    @XmlElement(name = "membership-state", type = MembershipStateImpl.class)
    protected MembershipStateImpl membershipState;
    @XmlElement(name = "is-following")
    protected boolean isFollowing;
    @XmlElement(name = "is-liked")
    protected boolean isLiked;
    @XmlElement(name = "available-actions", type = AvailableActionsImpl.class)
    protected AvailableActionsImpl availableActions;

    public RelatedConnections getRelatedConnections() {
        return relatedConnections;
    }

    public void setRelatedConnections(RelatedConnections value) {
        this.relatedConnections = ((RelatedConnectionsImpl) value);
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long value) {
        this.distance = value;
    }

    public MembershipState getMembershipState() {
        return membershipState;
    }

    public void setMembershipState(MembershipState value) {
        this.membershipState = ((MembershipStateImpl) value);
    }

    public boolean isIsFollowing() {
        return isFollowing;
    }

    public void setIsFollowing(boolean value) {
        this.isFollowing = value;
    }

    public boolean isIsLiked() {
        return isLiked;
    }

    public void setIsLiked(boolean value) {
        this.isLiked = value;
    }

    public AvailableActions getAvailableActions() {
        return availableActions;
    }

    public void setAvailableActions(AvailableActions value) {
        this.availableActions = ((AvailableActionsImpl) value);
    }

}
