package com.testLiftShift;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void stringToInt (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stringToInt)>> ---
		// @sigtype java 3.5
		// [i] field:0:required string
		// [o] object:0:required integer
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	string = IDataUtil.getString( pipelineCursor, "string" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		IDataUtil.put( pipelineCursor_1, "integer", Integer.parseInt(string) );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

