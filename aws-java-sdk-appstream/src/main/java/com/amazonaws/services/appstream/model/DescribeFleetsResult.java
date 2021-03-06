/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appstream.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of fleet details.
     * </p>
     */
    private java.util.List<Fleet> fleets;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of fleet details.
     * </p>
     * 
     * @return The list of fleet details.
     */

    public java.util.List<Fleet> getFleets() {
        return fleets;
    }

    /**
     * <p>
     * The list of fleet details.
     * </p>
     * 
     * @param fleets
     *        The list of fleet details.
     */

    public void setFleets(java.util.Collection<Fleet> fleets) {
        if (fleets == null) {
            this.fleets = null;
            return;
        }

        this.fleets = new java.util.ArrayList<Fleet>(fleets);
    }

    /**
     * <p>
     * The list of fleet details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleets(java.util.Collection)} or {@link #withFleets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fleets
     *        The list of fleet details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsResult withFleets(Fleet... fleets) {
        if (this.fleets == null) {
            setFleets(new java.util.ArrayList<Fleet>(fleets.length));
        }
        for (Fleet ele : fleets) {
            this.fleets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fleet details.
     * </p>
     * 
     * @param fleets
     *        The list of fleet details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsResult withFleets(java.util.Collection<Fleet> fleets) {
        setFleets(fleets);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleets() != null)
            sb.append("Fleets: ").append(getFleets()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetsResult == false)
            return false;
        DescribeFleetsResult other = (DescribeFleetsResult) obj;
        if (other.getFleets() == null ^ this.getFleets() == null)
            return false;
        if (other.getFleets() != null && other.getFleets().equals(this.getFleets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleets() == null) ? 0 : getFleets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetsResult clone() {
        try {
            return (DescribeFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
