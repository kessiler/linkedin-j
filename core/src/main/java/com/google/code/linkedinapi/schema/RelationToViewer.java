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

package com.google.code.linkedinapi.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}related-connections"/>
 *         &lt;element ref="{}distance"/>
 *         &lt;element ref="{}membership-state" minOccurs="0"/>
 *         &lt;element ref="{}is-following"/>
 *         &lt;element ref="{}is-liked"/>
 *         &lt;element ref="{}available-actions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface RelationToViewer
    extends SchemaEntity
{


    /**
     * Gets the value of the relatedConnections property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedConnections }
     *     
     */
    RelatedConnections getRelatedConnections();

    /**
     * Sets the value of the relatedConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedConnections }
     *     
     */
    void setRelatedConnections(RelatedConnections value);

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getDistance();

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDistance(Long value);

    /**
     * Gets the value of the membershipState property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipState }
     *     
     */
    MembershipState getMembershipState();

    /**
     * Sets the value of the membershipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipState }
     *     
     */
    void setMembershipState(MembershipState value);

    /**
     * Gets the value of the isFollowing property.
     * 
     */
    boolean isIsFollowing();

    /**
     * Sets the value of the isFollowing property.
     * 
     */
    void setIsFollowing(boolean value);

    /**
     * Gets the value of the isLiked property.
     * 
     */
    boolean isIsLiked();

    /**
     * Sets the value of the isLiked property.
     * 
     */
    void setIsLiked(boolean value);

    /**
     * Gets the value of the availableActions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableActions }
     *     
     */
    AvailableActions getAvailableActions();

    /**
     * Sets the value of the availableActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableActions }
     *     
     */
    void setAvailableActions(AvailableActions value);

}
