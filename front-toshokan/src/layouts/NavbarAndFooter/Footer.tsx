export const Footer = () => {
    return (
        <div className='main-color fixed-bottom'>
            <footer className='container d-flex flex-wrap 
                justify-content-between align-items-center py-5 main-color'>
                <p className='col-md-4 mb-0 text-white'>@ FitHon - Designed and Built by Noah Jung</p>
                <ul className='nav navbar-dark col-md-4 justify-content-end'>
                    <li className='nav-item'>
                        <a href='#' className='nav-link px-2 text-white'>
                            ホーム
                        </a>
                    </li>
                    <li className='nav-item'>
                        <a href='#' className='nav-link px-2 text-white'>
                            本の検索
                        </a>
                    </li>
                </ul>
            </footer>
        </div>
    )
}