package de.piratenpartei.berlin.ldadmin.app.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.jooq.DSLContext;
import org.springframework.stereotype.Component;
import org.supercsv.cellprocessor.ift.CellProcessor;

import de.piratenpartei.berlin.ldadmin.app.model.lf.LFMember;
import de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Member;

@Component
public interface LFMemberService {
	
	
	public Connection getConnection() throws SQLException,
			IllegalStateException, InstantiationException,
			IllegalAccessException, ClassNotFoundException;

	public DSLContext getDsl() throws SQLException, IllegalStateException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException;

	public boolean checkMembersExistInLiquidFeedback(
			ArrayList<LFMember> memberlist, boolean b,
			HttpServletRequest request);

	public String createRandom();

	/**
	 * 
	 * @param request
	 *            can be null
	 * @param text
	 */
	public void saveError(HttpServletRequest request, String text);

	/**
	 * 
	 * @param request
	 *            can be null
	 * @param text
	 */
	public void saveMessage(HttpServletRequest request, String text);

	public void deleteMembers(ArrayList<LFMember> memberlist,
			HttpServletRequest request);

	public void setPseudonymsToMembers(ArrayList<LFMember> memberlist,
			HttpServletRequest request);

	public void preRegisterAndInvite(ArrayList<LFMember> memberlist,
			HttpServletRequest request) throws Exception;

	public String getText(String msgKey, Object[] args, Locale locale);

	public String getText(String msgKey, String arg, Locale locale);

	public String getText(String msgKey, Locale locale);

	public ArrayList<LFMember> csvToLFMemberlist(File csvFile,
			CellProcessor[] cellProcessor, String[] header,HttpServletRequest request) throws IOException;

	public CellProcessor[] getNewProcessors();

	public CellProcessor[] getProcessors();

	public String[] getNewHeader();

	public String[] getHeader();

	public boolean checkMembersIdentifiableInLiquidFeedback(
			ArrayList<LFMember> memberlist, boolean b,
			HttpServletRequest request, String string);

	public void sendServiceUserMessage(String email, String msg, String url,
			String subject);

	public void sendServiceUserMessage(String email, File msg, String url,
			String subject) throws IOException;

	public void writeServiceExecutionLogAndWipe(BufferedWriter fw)
			throws IOException;

	public ArrayList<Member> getMembersScheduledForDeletion();

	public void deleteMembersScheduledForDeletion(
			ArrayList<Member> futureExMembers);

	public boolean cleanIssues();

	public boolean documentInitiatives();

}