/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Amazon EBS volume.
 * </p>
 */
public class Ebs implements Serializable {

    /**
     * The ID of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String snapshotId;

    /**
     * The volume size, in gigabytes. <p>Valid values: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     * specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     * <code>VolumeSize</code> must be equal to or larger than the size of
     * the snapshot. <p>Default: If you create a volume from a snapshot and
     * you don't specify a volume size, the default is the size of the
     * snapshot. <p>Required: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     */
    private Integer volumeSize;

    /**
     * The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     * <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String volumeType;

    /**
     * Indicates whether to delete the volume on instance termination.
     * <p>Default: <code>true</code>
     */
    private Boolean deleteOnTermination;

    /**
     * For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     * per second (IOPS) to provision for the volume. <p>Valid values: Range
     * is 100 to 4000. <p>Default: None
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     */
    private Integer iops;

    /**
     * The ID of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param snapshotId The ID of the snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param snapshotId The ID of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The volume size, in gigabytes. <p>Valid values: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     * specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     * <code>VolumeSize</code> must be equal to or larger than the size of
     * the snapshot. <p>Default: If you create a volume from a snapshot and
     * you don't specify a volume size, the default is the size of the
     * snapshot. <p>Required: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @return The volume size, in gigabytes. <p>Valid values: If the volume type is
     *         <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     *         specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     *         <code>VolumeSize</code> must be equal to or larger than the size of
     *         the snapshot. <p>Default: If you create a volume from a snapshot and
     *         you don't specify a volume size, the default is the size of the
     *         snapshot. <p>Required: Required when the volume type is
     *         <code>io1</code>.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The volume size, in gigabytes. <p>Valid values: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     * specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     * <code>VolumeSize</code> must be equal to or larger than the size of
     * the snapshot. <p>Default: If you create a volume from a snapshot and
     * you don't specify a volume size, the default is the size of the
     * snapshot. <p>Required: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize The volume size, in gigabytes. <p>Valid values: If the volume type is
     *         <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     *         specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     *         <code>VolumeSize</code> must be equal to or larger than the size of
     *         the snapshot. <p>Default: If you create a volume from a snapshot and
     *         you don't specify a volume size, the default is the size of the
     *         snapshot. <p>Required: Required when the volume type is
     *         <code>io1</code>.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The volume size, in gigabytes. <p>Valid values: If the volume type is
     * <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     * specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     * <code>VolumeSize</code> must be equal to or larger than the size of
     * the snapshot. <p>Default: If you create a volume from a snapshot and
     * you don't specify a volume size, the default is the size of the
     * snapshot. <p>Required: Required when the volume type is
     * <code>io1</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize The volume size, in gigabytes. <p>Valid values: If the volume type is
     *         <code>io1</code>, the minimum size of the volume is 10 GiB. If you
     *         specify <code>SnapshotId</code> and <code>VolumeSize</code>,
     *         <code>VolumeSize</code> must be equal to or larger than the size of
     *         the snapshot. <p>Default: If you create a volume from a snapshot and
     *         you don't specify a volume size, the default is the size of the
     *         snapshot. <p>Required: Required when the volume type is
     *         <code>io1</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     * <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     *         <p>Default: <code>standard</code>
     */
    public String getVolumeType() {
        return volumeType;
    }
    
    /**
     * The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     * <p>Default: <code>standard</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param volumeType The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     *         <p>Default: <code>standard</code>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    
    /**
     * The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     * <p>Default: <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param volumeType The volume type. <p>Valid values: <code>standard | io1 | gp2</code>
     *         <p>Default: <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * Indicates whether to delete the volume on instance termination.
     * <p>Default: <code>true</code>
     *
     * @return Indicates whether to delete the volume on instance termination.
     *         <p>Default: <code>true</code>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether to delete the volume on instance termination.
     * <p>Default: <code>true</code>
     *
     * @param deleteOnTermination Indicates whether to delete the volume on instance termination.
     *         <p>Default: <code>true</code>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether to delete the volume on instance termination.
     * <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether to delete the volume on instance termination.
     *         <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Indicates whether to delete the volume on instance termination.
     * <p>Default: <code>true</code>
     *
     * @return Indicates whether to delete the volume on instance termination.
     *         <p>Default: <code>true</code>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     * per second (IOPS) to provision for the volume. <p>Valid values: Range
     * is 100 to 4000. <p>Default: None
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @return For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     *         per second (IOPS) to provision for the volume. <p>Valid values: Range
     *         is 100 to 4000. <p>Default: None
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     * per second (IOPS) to provision for the volume. <p>Valid values: Range
     * is 100 to 4000. <p>Default: None
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @param iops For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     *         per second (IOPS) to provision for the volume. <p>Valid values: Range
     *         is 100 to 4000. <p>Default: None
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     * per second (IOPS) to provision for the volume. <p>Valid values: Range
     * is 100 to 4000. <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 20000<br/>
     *
     * @param iops For Provisioned IOPS (SSD) volumes only. The number of I/O operations
     *         per second (IOPS) to provision for the volume. <p>Valid values: Range
     *         is 100 to 4000. <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ebs withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null) sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null) sb.append("VolumeType: " + getVolumeType() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Ebs == false) return false;
        Ebs other = (Ebs)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null) return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false) return false; 
        if (other.getVolumeType() == null ^ this.getVolumeType() == null) return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        return true;
    }
    
}
    