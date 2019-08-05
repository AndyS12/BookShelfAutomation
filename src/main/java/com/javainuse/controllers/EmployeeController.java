 @RequestMapping(value = "/bookStatus", method = RequestMethod.GET) 
    public ModelAndView book_status(@RequestParam String bookId) { 
        System.out.println("hello " +bookId); 
        ModelAndView mv = new ModelAndView("product-single"); 
        mv.addObject("BookId", bookId); 
        return mv; 
    } 
