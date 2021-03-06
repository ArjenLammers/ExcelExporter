// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package odm.proxies;

/**
 * 
 */
public class Order
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject orderMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ODM.Order";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OrderNr("OrderNr"),
		Name("Name"),
		Address("Address"),
		City("City"),
		Status("Status"),
		VAT("VAT"),
		TotalExclVAT("TotalExclVAT"),
		TotalInclVAT("TotalInclVAT"),
		CreateDate("CreateDate"),
		Year("Year");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Order(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ODM.Order"));
	}

	protected Order(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject orderMendixObject)
	{
		if (orderMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ODM.Order", orderMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ODM.Order");

		this.orderMendixObject = orderMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Order.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static odm.proxies.Order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return odm.proxies.Order.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static odm.proxies.Order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new odm.proxies.Order(context, mendixObject);
	}

	public static odm.proxies.Order load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return odm.proxies.Order.initialize(context, mendixObject);
	}

	public static java.util.List<odm.proxies.Order> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<odm.proxies.Order> result = new java.util.ArrayList<odm.proxies.Order>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ODM.Order" + xpathConstraint))
			result.add(odm.proxies.Order.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of OrderNr
	 */
	public final Long getOrderNr()
	{
		return getOrderNr(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderNr
	 */
	public final Long getOrderNr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.OrderNr.toString());
	}

	/**
	 * Set value of OrderNr
	 * @param ordernr
	 */
	public final void setOrderNr(Long ordernr)
	{
		setOrderNr(getContext(), ordernr);
	}

	/**
	 * Set value of OrderNr
	 * @param context
	 * @param ordernr
	 */
	public final void setOrderNr(com.mendix.systemwideinterfaces.core.IContext context, Long ordernr)
	{
		getMendixObject().setValue(context, MemberNames.OrderNr.toString(), ordernr);
	}

	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Address
	 */
	public final String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of City
	 */
	public final String getCity()
	{
		return getCity(getContext());
	}

	/**
	 * @param context
	 * @return value of City
	 */
	public final String getCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.City.toString());
	}

	/**
	 * Set value of City
	 * @param city
	 */
	public final void setCity(String city)
	{
		setCity(getContext(), city);
	}

	/**
	 * Set value of City
	 * @param context
	 * @param city
	 */
	public final void setCity(com.mendix.systemwideinterfaces.core.IContext context, String city)
	{
		getMendixObject().setValue(context, MemberNames.City.toString(), city);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final odm.proxies.OrderStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final odm.proxies.OrderStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return odm.proxies.OrderStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(odm.proxies.OrderStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, odm.proxies.OrderStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of VAT
	 */
	public final Double getVAT()
	{
		return getVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of VAT
	 */
	public final Double getVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.VAT.toString());
	}

	/**
	 * Set value of VAT
	 * @param vat
	 */
	public final void setVAT(Double vat)
	{
		setVAT(getContext(), vat);
	}

	/**
	 * Set value of VAT
	 * @param context
	 * @param vat
	 */
	public final void setVAT(com.mendix.systemwideinterfaces.core.IContext context, Double vat)
	{
		getMendixObject().setValue(context, MemberNames.VAT.toString(), vat);
	}

	/**
	 * @return value of TotalExclVAT
	 */
	public final Double getTotalExclVAT()
	{
		return getTotalExclVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalExclVAT
	 */
	public final Double getTotalExclVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.TotalExclVAT.toString());
	}

	/**
	 * Set value of TotalExclVAT
	 * @param totalexclvat
	 */
	public final void setTotalExclVAT(Double totalexclvat)
	{
		setTotalExclVAT(getContext(), totalexclvat);
	}

	/**
	 * Set value of TotalExclVAT
	 * @param context
	 * @param totalexclvat
	 */
	public final void setTotalExclVAT(com.mendix.systemwideinterfaces.core.IContext context, Double totalexclvat)
	{
		getMendixObject().setValue(context, MemberNames.TotalExclVAT.toString(), totalexclvat);
	}

	/**
	 * @return value of TotalInclVAT
	 */
	public final Double getTotalInclVAT()
	{
		return getTotalInclVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalInclVAT
	 */
	public final Double getTotalInclVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.TotalInclVAT.toString());
	}

	/**
	 * Set value of TotalInclVAT
	 * @param totalinclvat
	 */
	public final void setTotalInclVAT(Double totalinclvat)
	{
		setTotalInclVAT(getContext(), totalinclvat);
	}

	/**
	 * Set value of TotalInclVAT
	 * @param context
	 * @param totalinclvat
	 */
	public final void setTotalInclVAT(com.mendix.systemwideinterfaces.core.IContext context, Double totalinclvat)
	{
		getMendixObject().setValue(context, MemberNames.TotalInclVAT.toString(), totalinclvat);
	}

	/**
	 * @return value of CreateDate
	 */
	public final java.util.Date getCreateDate()
	{
		return getCreateDate(getContext());
	}

	/**
	 * @param context
	 * @return value of CreateDate
	 */
	public final java.util.Date getCreateDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CreateDate.toString());
	}

	/**
	 * Set value of CreateDate
	 * @param createdate
	 */
	public final void setCreateDate(java.util.Date createdate)
	{
		setCreateDate(getContext(), createdate);
	}

	/**
	 * Set value of CreateDate
	 * @param context
	 * @param createdate
	 */
	public final void setCreateDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date createdate)
	{
		getMendixObject().setValue(context, MemberNames.CreateDate.toString(), createdate);
	}

	/**
	 * @return value of Year
	 */
	public final Long getYear()
	{
		return getYear(getContext());
	}

	/**
	 * @param context
	 * @return value of Year
	 */
	public final Long getYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.Year.toString());
	}

	/**
	 * Set value of Year
	 * @param year
	 */
	public final void setYear(Long year)
	{
		setYear(getContext(), year);
	}

	/**
	 * Set value of Year
	 * @param context
	 * @param year
	 */
	public final void setYear(com.mendix.systemwideinterfaces.core.IContext context, Long year)
	{
		getMendixObject().setValue(context, MemberNames.Year.toString(), year);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return orderMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final odm.proxies.Order that = (odm.proxies.Order) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ODM.Order";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
