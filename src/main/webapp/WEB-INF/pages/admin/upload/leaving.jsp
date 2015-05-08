<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="upload.title" /></title>
<meta name="menu" content="MemberMenu" />
</head>

<div class="col-sm-12">
	<h2>
		<fmt:message key="ldadmin.menu.members.leaving.fileupload" />
	</h2>
	<p>
		<fmt:message key="upload.message" />
	</p>
</div>


<div class="col-sm-7">
	<spring:bind path="fileUpload.*">
		<c:if test="${not empty status.errorMessages}">
			<div class="alert alert-danger alert-dismissable">
				<a href="#" data-dismiss="alert" class="close">&times;</a>
				<c:forEach var="error" items="${status.errorMessages}">
					<c:out value="${error}" escapeXml="false" />
					<br />
				</c:forEach>
			</div>
		</c:if>
	</spring:bind>

	<form:form commandName="fileUpload" method="post" action="${ctx}/admin/upload/leaving"
		enctype="multipart/form-data"
		onsubmit="return validateFileUpload(this)" id="uploadForm"
		cssClass="well">

		<spring:bind path="fileUpload.file">
			<div
				class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
		</spring:bind>
		<appfuse:label key="uploadForm.file" styleClass="control-label" />
		<input type="file" name="file" id="file" />
		<form:errors path="file" cssClass="help-block" />
</div>
<div class="form-group">
	<button type="submit" name="upload" class="btn btn-primary"
		onclick="bCancel=false">
		<i class="icon-upload icon-white"></i>
		<fmt:message key="button.upload" />
	</button>
	<button type="submit" name="cancel" class="btn btn-default"
		onclick="bCancel=true">
		<i class="icon-remove"></i>
		<fmt:message key="button.cancel" />
	</button>
</div>
</form:form>
</div>
<c:set var="scripts" scope="request">
	<v:javascript formName="fileUpload" staticJavascript="false" />
	<script type="text/javascript"
		src="<c:url value="/scripts/validator.jsp"/>"></script>
</c:set>