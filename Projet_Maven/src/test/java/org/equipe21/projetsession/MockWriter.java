package org.equipe21.projetsession;

import org.equipe21.projetsession.WriterWrapper;

public class MockWriter extends WriterWrapper{
    
    private String writtenData = "";
    
    public MockWriter() {
        super(null);
    }
    
    
    @Override
    public void write(String str) {
        writtenData += str;
    }
    
    
    @Override
    public void flush() {
    }
    
    
    @Override
    public void close() {
    }
    
    
    public String getWrittenData() {
        return writtenData;
    }
}
