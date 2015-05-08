/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.udt.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DelegationChainRow implements org.liquidfeedback.generated.udt.interfaces.IDelegationChainRow {

	private static final long serialVersionUID = -1789131263;

	private final java.lang.Integer                                         index;
	private final java.lang.Integer                                         memberId;
	private final java.lang.Boolean                                         memberValid;
	private final java.lang.Boolean                                         participation;
	private final java.lang.Boolean                                         overridden;
	private final org.liquidfeedback.generated.enums.DelegationScope        scopeIn;
	private final org.liquidfeedback.generated.enums.DelegationScope        scopeOut;
	private final java.lang.Boolean                                         disabledOut;
	private final org.liquidfeedback.generated.enums.DelegationChainLoopTag loop;

	public DelegationChainRow(
		java.lang.Integer                                         index,
		java.lang.Integer                                         memberId,
		java.lang.Boolean                                         memberValid,
		java.lang.Boolean                                         participation,
		java.lang.Boolean                                         overridden,
		org.liquidfeedback.generated.enums.DelegationScope        scopeIn,
		org.liquidfeedback.generated.enums.DelegationScope        scopeOut,
		java.lang.Boolean                                         disabledOut,
		org.liquidfeedback.generated.enums.DelegationChainLoopTag loop
	) {
		this.index = index;
		this.memberId = memberId;
		this.memberValid = memberValid;
		this.participation = participation;
		this.overridden = overridden;
		this.scopeIn = scopeIn;
		this.scopeOut = scopeOut;
		this.disabledOut = disabledOut;
		this.loop = loop;
	}

	@Override
	public java.lang.Integer getIndex() {
		return this.index;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.Boolean getMemberValid() {
		return this.memberValid;
	}

	@Override
	public java.lang.Boolean getParticipation() {
		return this.participation;
	}

	@Override
	public java.lang.Boolean getOverridden() {
		return this.overridden;
	}

	@Override
	public org.liquidfeedback.generated.enums.DelegationScope getScopeIn() {
		return this.scopeIn;
	}

	@Override
	public org.liquidfeedback.generated.enums.DelegationScope getScopeOut() {
		return this.scopeOut;
	}

	@Override
	public java.lang.Boolean getDisabledOut() {
		return this.disabledOut;
	}

	@Override
	public org.liquidfeedback.generated.enums.DelegationChainLoopTag getLoop() {
		return this.loop;
	}
}
