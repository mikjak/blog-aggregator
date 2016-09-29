<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<h1>${user.name}</h1>

<c:forEach items="${user.blogs}" var="blog">
<h2>${blog.name}</h2>
<p>					
	<a href="<spring:url value="${blog.url}" />">
		${blog.url}
	</a>
</p>

<table class="table table-bordered table-hover table-striped">
	<thead>
		<tr>
			<th>Title</th>
			<th>Link</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${blog.items}" var="item">
			<tr>
				<td>
					${item.title}
				</td>
				<td>
					<a href="<spring:url value="${item.link}" />">
						${item.link}
					</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</c:forEach>