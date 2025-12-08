package singleResponsibility.last.bestCase;

public class ProductController {

    private final FileService fileService;

    public ProductController(FileService fileService) {
        this.fileService = fileService;
    }
    //add product
    public void add(ProductCreateDto productCreateDto) throws Exception {
        ValidationTool.validateProduct(productCreateDto);
        fileService.upload(productCreateDto.files);
        // add product using dao or service
        // return response
    }
}