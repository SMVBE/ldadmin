/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITemporaryTransactionData extends java.io.Serializable {

	/**
	 * Getter for <code>temporary_transaction_data.txid</code>.
	 */
	public java.lang.Long getTxid();

	/**
	 * Getter for <code>temporary_transaction_data.key</code>.
	 */
	public java.lang.String getKey();

	/**
	 * Getter for <code>temporary_transaction_data.value</code>.
	 */
	public java.lang.String getValue();
}
