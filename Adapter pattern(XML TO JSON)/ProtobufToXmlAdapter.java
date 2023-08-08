public class ProtobufToXmlAdapter implements Adapter {
    private Proto proto;

    public ProtobufToXmlAdapter(Proto proto){
        this.proto = proto;
    }
    @Override
    public XML convert(Object type) {
        return this.proto.convertToXML();
    }
    
}
