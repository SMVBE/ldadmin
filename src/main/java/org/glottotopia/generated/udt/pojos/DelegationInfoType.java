/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.udt.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DelegationInfoType implements org.glottotopia.generated.udt.interfaces.IDelegationInfoType {

	private static final long serialVersionUID = -2026876430;

	private final java.lang.Boolean                                         ownParticipation;
	private final org.glottotopia.generated.enums.DelegationScope        ownDelegationScope;
	private final java.lang.Integer                                         firstTrusteeId;
	private final java.lang.Boolean                                         firstTrusteeParticipation;
	private final java.lang.Boolean                                         firstTrusteeEllipsis;
	private final java.lang.Integer                                         otherTrusteeId;
	private final java.lang.Boolean                                         otherTrusteeParticipation;
	private final java.lang.Boolean                                         otherTrusteeEllipsis;
	private final org.glottotopia.generated.enums.DelegationInfoLoopType delegationLoop;
	private final java.lang.Integer                                         participatingMemberId;

	public DelegationInfoType(
		java.lang.Boolean                                         ownParticipation,
		org.glottotopia.generated.enums.DelegationScope        ownDelegationScope,
		java.lang.Integer                                         firstTrusteeId,
		java.lang.Boolean                                         firstTrusteeParticipation,
		java.lang.Boolean                                         firstTrusteeEllipsis,
		java.lang.Integer                                         otherTrusteeId,
		java.lang.Boolean                                         otherTrusteeParticipation,
		java.lang.Boolean                                         otherTrusteeEllipsis,
		org.glottotopia.generated.enums.DelegationInfoLoopType delegationLoop,
		java.lang.Integer                                         participatingMemberId
	) {
		this.ownParticipation = ownParticipation;
		this.ownDelegationScope = ownDelegationScope;
		this.firstTrusteeId = firstTrusteeId;
		this.firstTrusteeParticipation = firstTrusteeParticipation;
		this.firstTrusteeEllipsis = firstTrusteeEllipsis;
		this.otherTrusteeId = otherTrusteeId;
		this.otherTrusteeParticipation = otherTrusteeParticipation;
		this.otherTrusteeEllipsis = otherTrusteeEllipsis;
		this.delegationLoop = delegationLoop;
		this.participatingMemberId = participatingMemberId;
	}

	@Override
	public java.lang.Boolean getOwnParticipation() {
		return this.ownParticipation;
	}

	@Override
	public org.glottotopia.generated.enums.DelegationScope getOwnDelegationScope() {
		return this.ownDelegationScope;
	}

	@Override
	public java.lang.Integer getFirstTrusteeId() {
		return this.firstTrusteeId;
	}

	@Override
	public java.lang.Boolean getFirstTrusteeParticipation() {
		return this.firstTrusteeParticipation;
	}

	@Override
	public java.lang.Boolean getFirstTrusteeEllipsis() {
		return this.firstTrusteeEllipsis;
	}

	@Override
	public java.lang.Integer getOtherTrusteeId() {
		return this.otherTrusteeId;
	}

	@Override
	public java.lang.Boolean getOtherTrusteeParticipation() {
		return this.otherTrusteeParticipation;
	}

	@Override
	public java.lang.Boolean getOtherTrusteeEllipsis() {
		return this.otherTrusteeEllipsis;
	}

	@Override
	public org.glottotopia.generated.enums.DelegationInfoLoopType getDelegationLoop() {
		return this.delegationLoop;
	}

	@Override
	public java.lang.Integer getParticipatingMemberId() {
		return this.participatingMemberId;
	}
}
