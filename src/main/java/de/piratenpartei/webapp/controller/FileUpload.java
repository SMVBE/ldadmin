package de.piratenpartei.webapp.controller;




/**
 * Command class to handle uploading of a file.
 *
 * <p>
 * <a href="FileUpload.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class FileUpload {
    private String name;
    private String localPath;
    private String listType;
    private String lastModified;
    private float length;
    private byte[] file;

    
    public FileUpload() {
	}
    
    public FileUpload(String name, String localPath, String string,
    		float length) {
		super();
		this.name = name;
		this.localPath = localPath;
		this.lastModified = string;
		this.length = length;
	}

	/**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public byte[] getFile() {
        return file;
    }

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getListType() {
		return listType;
	}

	public void setListType(String listType) {
		this.listType = listType;
	}
}
